SUMMARY = "Headers for default version of nodejs"
DESCRIPTION = "Depends on the most current and up-to-date version of nodejs for \
the current architecture and codestream."
LICENSE = "MIT"

PV = "5.1"

RPM_NAME = "nodejs-devel-default-5.1-1.2.aarch64.rpm"
RPM_HASH = "b2a8d0271c34b99a1c342c07684363cd70ddf01dafdb32b65d0f4a8f7e5f318a72b1d7667971749ae1dfccba169081d539464a24af603294e5028bb25e3a179b"

RPROVIDES:${PN} += "nodejs-devel nodejs-devel-default nodejs-devel-default(aarch-64)"
RDEPENDS:${PN} += "nodejs19-devel npm-default"

inherit rpm
