SUMMARY = "Tk backend for python39-matplotlib"
DESCRIPTION = "This package includes the Tk-based tkagg backend \
for the python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-tk-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "019db754ec72ef737bccd39835cf28eec0675aa863358d2fb5cc74de14a68b9ab45d64162634fe9369d07989fddd4add7f917f0ea91841b7f63ee1c51c9cf5ac"

RPROVIDES:${PN} += "python39-matplotlib-tk \
python39-matplotlib-tk(aarch-64)"
RDEPENDS:${PN} += "python(abi) \
python39-Pillow-tk \
python39-matplotlib \
python39-tk \
tcl"

inherit rpm
