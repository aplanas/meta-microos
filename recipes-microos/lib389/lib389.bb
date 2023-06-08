SUMMARY = "389 Directory Server administration tools and library"
DESCRIPTION = "Python library for interacting with and administering 389 \
Directory Server instances locally or remotely."
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "2.4.0~git0.87efeb2"

RPM_NAME = "lib389-2.4.0~git0.87efeb2-1.1.aarch64.rpm"
RPM_HASH = "1624c86cd526bf8fdd9a1b5a8d3c6fd5297be629868dbc6f4ca4cfb89bf0e64d42e80b399e928c1ece11850184094ca49c49ffa2e0ece9e3831650b9e4ac6251"

RPROVIDES:${PN} += "lib389 lib389(aarch-64) python3-lib389 python3.10dist(lib389) python3dist(lib389)"
RDEPENDS:${PN} += "/usr/bin/python3 iproute2 krb5-client mozilla-nss-tools openssl(cli) python(abi) python3-argcomplete python3-argparse-manpage python3-cryptography python3-distro python3-ldap python3-pyasn1 python3-pyasn1-modules python3-python-dateutil python3-python-slugify"

inherit rpm
