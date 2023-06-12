SUMMARY = "Common code for the yast python ad modules"
DESCRIPTION = "Common code shared by the yast2-aduc, yast2-adsi, and yast2-gpmc modules."
LICENSE = "GPL-3.0-or-later"

PV = "1.6"

RPM_NAME = "yast2-adcommon-python-1.6-1.8.noarch.rpm"
RPM_HASH = "c186cc44f0f9d846bb2de3310a7de566ee3d87ff05b0ac96d2d1fc0d7ca211cd0984d012ac42e05d191b9711e0e227277ee87824ff0a79e7140189611ab65e19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-adcommon-python"
RDEPENDS:${PN} += "krb5-client \
python(abi) \
python3-keyring \
python3-ldap \
python3-ldb \
samba-client \
samba-dsdb-modules \
samba-python3 \
yast2 \
yast2-python3-bindings"

inherit rpm
