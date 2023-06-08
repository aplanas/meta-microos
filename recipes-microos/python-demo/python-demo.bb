SUMMARY = "Python Demonstration Scripts"
DESCRIPTION = "Various demonstrations of what you can do with Python and a number of \
programs that are useful for building or extending Python."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-demo-2.7.18-33.1.aarch64.rpm"
RPM_HASH = "b0c0113330cdf9aa8842042bd7ca4b82a86306acda6bc5234596b714d5e66f1f48404f26629b061f5c05f907315e6f0328d8b12f25a63fd9c8057b06808a7443"

RPROVIDES:${PN} += "pyth_dmo python-demo python-demo(aarch-64) python2-demo"
RDEPENDS:${PN} += "python-base"

inherit rpm
