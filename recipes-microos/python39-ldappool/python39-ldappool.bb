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

RPM_NAME = "python39-ldappool-3.0.0-3.3.noarch.rpm"
RPM_HASH = "51ec332962dffc30360e94899193c00191eda6f060359f5203d680628594396ec8f2a8a422bb703809ca732bde8f78554d3a073732f7cede93a95482c71ec6d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ldappool) python39-ldappool python3dist(ldappool)"
RDEPENDS:${PN} += "python(abi) python39-ldap python39-prettytable"

inherit rpm
