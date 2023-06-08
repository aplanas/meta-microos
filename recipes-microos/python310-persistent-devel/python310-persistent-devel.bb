SUMMARY = "Translucent persistent objects"
DESCRIPTION = "This package contains the files needed for binding the python310-persistent C module."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python310-persistent-devel-5.0-1.4.aarch64.rpm"
RPM_HASH = "8357790295dc6e9a7457fbd90e21522860dd09f04be0b5905fb855379b56151ce4a1f2bda1e36cc972b798ea75fbf3db2d56417ae6431d8ab935af40bb0b6f05"

RPROVIDES:${PN} += "python3-persistent-devel python310-persistent-devel python310-persistent-devel(aarch-64)"
RDEPENDS:${PN} += "python310-devel python310-persistent"

inherit rpm
