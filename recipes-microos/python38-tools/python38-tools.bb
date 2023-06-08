SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.8.16"

RPM_NAME = "python38-tools-3.8.16-6.1.aarch64.rpm"
RPM_HASH = "6296713f0b19a8d647c42c93ef02ffd085d037b7f36f399e4d0aa9547edbf7a247b85373a14ad858c5a7aa2ded9684e1372b2f011fd9d9e1f5cdf2b739ec18bf"

RPROVIDES:${PN} += "python38-2to3 python38-demo python38-tools python38-tools(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3.8 python(abi) python38-base"

inherit rpm
