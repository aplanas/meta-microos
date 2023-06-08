SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.10.10"

RPM_NAME = "python310-tools-3.10.10-2.3.aarch64.rpm"
RPM_HASH = "1e2573214b87b537bea45a1b84de10d6985a164d2156f5921120fbf134c75d25104eaac651e846fdde217e3caf781685a191b98a78fd5b60c8f037adead2c9e5"

RPROVIDES:${PN} += "python3-2to3 python3-demo python3-tools python310-2to3 python310-demo python310-tools python310-tools(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 /usr/bin/python3.10 python(abi) python310-base"

inherit rpm
