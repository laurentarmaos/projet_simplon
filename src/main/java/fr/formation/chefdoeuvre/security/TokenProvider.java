package fr.formation.chefdoeuvre.security;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

public class TokenProvider {

    private final Algorithm algorithm;

    private final ZoneId zoneId;

    private final String issuer;

    private final long expiration;

    TokenProvider(Algorithm algorithm, String timeZone, String issuer, long expiration) {

	this.algorithm = algorithm;
	zoneId = ZoneId.of(timeZone);
	this.issuer = issuer;
	this.expiration = expiration;
    }

    public IdToken idToken(Long userId, String subject, List<String> authorities) {

////////si la méthode dépérciée javautildate est encore utilisée dans l'appli///////////////////////////////////
	LocalDateTime now = LocalDateTime.now(zoneId);
	Date issuedAt = toJavaUtilDate(now);

	LocalDateTime expires = now.plusSeconds(expiration);
	Date expiresAt = toJavaUtilDate(expires);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	String accessToken = JWT.create().withIssuer(issuer).withIssuedAt(issuedAt).withExpiresAt(expiresAt)
		.withSubject(subject).withClaim("userId", userId).withClaim("authorities", authorities).sign(algorithm);
	return new IdToken(accessToken, expiration);
    }

    private Date toJavaUtilDate(LocalDateTime now) {

	return Date.from(now.atZone(zoneId).toInstant());
    }
}
