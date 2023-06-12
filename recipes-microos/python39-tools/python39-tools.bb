SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.9.16"

RPM_NAME = "python39-tools-3.9.16-8.1.aarch64.rpm"
RPM_HASH = "43dd0e81865047d84a6036a1caddb2de72b7fd74c27ee6d0c429c994b104303c9281cebf2fca0dfd620ba6164363949ed4d45b4432e0570bb0444eb13fcd645e"

RPROVIDES:${PN} += "python39-2to3 python39-demo python39-tools python39-tools(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3.9 python(abi) python39-base"

inherit rpm
