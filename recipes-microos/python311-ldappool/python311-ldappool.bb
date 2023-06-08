SUMMARY = "A connection pool for python-ldap"
DESCRIPTION = "A simple connector pool for python-ldap. \
 \
The pool keeps LDAP connectors alive and let you reuse them, \
drastically reducing the time spent to initiate a ldap connection. \
 \
The pool has useful features like: \
 \
- transparent reconnection on failures or server restarts \
- configurable pool size and connectors timeouts \
- configurable max lifetime for connectors \
- a context manager to simplify acquiring and releasing a connector"
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "3.0.0"

RPM_NAME = "python311-ldappool-3.0.0-3.3.noarch.rpm"
RPM_HASH = "e6172125d8627c11f56fe673d5a905c5119f194156ca3e002514df47ca4d1f0b0bfa0eee7c04653ca84fa89571d8c4d4f25e8e17df96c76c3692ffd34f7bcaed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ldappool) python311-ldappool python3dist(ldappool)"
RDEPENDS:${PN} += "python(abi) python311-ldap python311-prettytable"

inherit rpm
