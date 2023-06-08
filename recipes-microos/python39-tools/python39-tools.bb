SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.9.16"

RPM_NAME = "python39-tools-3.9.16-6.1.aarch64.rpm"
RPM_HASH = "3c6922a8165f45bbbfc3150db2690d00dd5808a857ecf62709a3cdcb0b72c753c4f04c598f68ac6efd379e2f338ba6d15811fe611cacecbdee1eeb41de59b7df"

RPROVIDES:${PN} += "python39-2to3 python39-demo python39-tools python39-tools(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3.9 python(abi) python39-base"

inherit rpm
