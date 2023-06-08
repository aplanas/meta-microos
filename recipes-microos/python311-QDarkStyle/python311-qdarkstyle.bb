SUMMARY = "A dark stylesheet for Python and Qt applications"
DESCRIPTION = "QDarkStyle is a dark stylesheet for Python and Qt applications."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python311-QDarkStyle-3.0.2-1.11.noarch.rpm"
RPM_HASH = "168675ec9a892547fad6b4ef3cd37699ca4306a5864f66b1f6c4145747a9c441f6198b8fe9f80d3e7f70a62926bd681a3b5c4894e367678f7c2f89cfd570952d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(qdarkstyle) python311-QDarkStyle python3dist(qdarkstyle)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-QtPy python311-setuptools"

inherit rpm
