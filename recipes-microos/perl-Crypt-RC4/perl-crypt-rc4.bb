SUMMARY = "Perl implementation of the RC4 encryption algorithm"
DESCRIPTION = "A simple implementation of the RC4 algorithm, developed by RSA Security, Inc. \
Here is the description from RSA's website: \
 \
RC4 is a stream cipher designed by Rivest for RSA Data Security (now RSA \
Security). It is a variable key-size stream cipher with byte-oriented \
operations. The algorithm is based on the use of a random permutation. Analysis \
shows that the period of the cipher is overwhelmingly likely to be greater than \
10100. Eight to sixteen machine operations are required per output byte, and \
the cipher can be expected to run very quickly in software. Independent \
analysts have scrutinized the algorithm and it is considered secure."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "2.02"

RPM_NAME = "perl-Crypt-RC4-2.02-13.29.aarch64.rpm"
RPM_HASH = "e58755bbaf54d9768cd90998d03789dd9960479d262d5389859821bd3fb20824479bc077e1d01f964a3fef150dd3f278a7028902736c56309dbc60d591e7528d"

RPROVIDES:${PN} += "perl(Crypt::RC4) \
perl-Crypt-RC4 \
perl-Crypt-RC4(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
