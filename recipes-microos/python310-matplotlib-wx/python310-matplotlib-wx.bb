SUMMARY = "WxWidgets backend for python310-matplotlib"
DESCRIPTION = "This package includes the wxWidgets-based wxagg backend \
for python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-wx-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "aca724ba74f49d3ecb40ca7e2a092e3030394f68581f9452c8168d947829f6899402373b5d070025bbe6b25ba536e78168ef96581710d4168807797ec42f3ef1"

RPROVIDES:${PN} += "python3-matplotlib-wx python310-matplotlib-wx python310-matplotlib-wx(aarch-64)"
RDEPENDS:${PN} += "python(abi) python310-matplotlib python310-wxPython"

inherit rpm
