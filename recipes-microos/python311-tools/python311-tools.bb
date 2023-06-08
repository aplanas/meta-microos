SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.11.2"

RPM_NAME = "python311-tools-3.11.2-1.6.aarch64.rpm"
RPM_HASH = "d05776063f218d55c152e0da9f6f50daa7fa0ff8414194fc24ebdf37f5f1722ee6b16248369b6434509d2ae2239709e5dcaceddfea40e05ebacd4e40b3826428"

RPROVIDES:${PN} += "python311-2to3 python311-demo python311-tools python311-tools(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3.11 python(abi) python311-base"

inherit rpm
