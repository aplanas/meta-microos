SUMMARY = "A Pure-Python Twisted library for LDAP"
DESCRIPTION = "Ldaptor is a pure-Python library that implements: \
 \
- LDAP client logic \
- separately-accessible LDAP and BER protocol message generation/parsing \
- ASCII-format LDAP filter generation and parsing \
- LDIF format data generation \
- Samba password changing logic"
LICENSE = "MIT"

PV = "21.2.0"

RPM_NAME = "python310-ldaptor-21.2.0-2.8.noarch.rpm"
RPM_HASH = "08e644c4ff05a66bb3022f45b26e0cd545d644e94bf81c667f035f6dd5f0c6503ef62977b714d7a9fbf8bb44d7ad555a24891b2f33e65995acf41abfa6a650b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ldaptor python3.10dist(ldaptor) python310-ldaptor python3dist(ldaptor)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-Twisted-tls python310-passlib python310-pyparsing python310-zope.interface update-alternatives"

inherit rpm
