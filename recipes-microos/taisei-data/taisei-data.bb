SUMMARY = "Data files for Taisei"
DESCRIPTION = "Data files for Taisei, an open clone of the Touhou Project series. Touhou is a \
one-man project of shoot ’em up games set in an isolated world full of \
Japanese folklore."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "taisei-data-1.3.2-2.12.noarch.rpm"
RPM_HASH = "fad592041013062a1afe985a8e353d688b73c73fe0928d667fd51e9b19e29b1179af5aff2056c65d344d3fdb703238e6bf55ce53479aeadbac71d4318275b6ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "taisei-data"
RDEPENDS:${PN} += "taisei"

inherit rpm
