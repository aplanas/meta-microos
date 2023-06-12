SUMMARY = "Samba Group Policy"
DESCRIPTION = "The samba-gpupdate package provides the samba-gpupdate tool for applying \
Group Policies on a Samba client."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "samba-gpupdate-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "5c8e12235aec016cff9028f6f2201426cae816a543148528de4dc30928a055ee99549e1e34245cbfa65d295ea443ea72cf8231de2bd1756026855f1e9081e8e2"

RPROVIDES:${PN} += "samba-gpupdate \
samba-gpupdate(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 \
cepces \
certmonger \
samba-ldb-ldap \
samba-python3 \
sscep"

inherit rpm
