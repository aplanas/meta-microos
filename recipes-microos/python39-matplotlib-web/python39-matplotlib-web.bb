SUMMARY = "Web backend for python39-matplotlib"
DESCRIPTION = "This package includes the browser-based webagg backend \
for the python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-web-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "731fa94fa1b257e07214481475e71dd2af6dd7f2e6e3f842c32bd19b6489942aa7455aafbc06cbd9a9430c914490ee40eec89c40fd9bece69967b56e1283114f"

RPROVIDES:${PN} += "python39-matplotlib-web \
python39-matplotlib-web(aarch-64)"
RDEPENDS:${PN} += "python(abi) \
python39-matplotlib \
python39-tornado"

inherit rpm
