SUMMARY = "389 Directory Server administration tools and library"
DESCRIPTION = "Python library for interacting with and administering 389 \
Directory Server instances locally or remotely."
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "2.4.0~git18.37ec5cd"

RPM_NAME = "lib389-2.4.0~git18.37ec5cd-1.2.aarch64.rpm"
RPM_HASH = "c4ec7d17424fd2b5dc0c4e116389a9ff870cc3a520c76373c616fa0d55c2c22486223fe76c9b40775b8256678bfd807f329f779563198fc3afd432ee1010c837"

RPROVIDES:${PN} += "lib389 lib389(aarch-64) python3-lib389 python3.10dist(lib389) python3dist(lib389)"
RDEPENDS:${PN} += "/usr/bin/python3 iproute2 krb5-client mozilla-nss-tools openssl(cli) python(abi) python3-argcomplete python3-argparse-manpage python3-cryptography python3-distro python3-ldap python3-pyasn1 python3-pyasn1-modules python3-python-dateutil python3-python-slugify"

inherit rpm
