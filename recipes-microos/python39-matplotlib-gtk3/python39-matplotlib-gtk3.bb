SUMMARY = "GTK3 backends for python39-matplotlib"
DESCRIPTION = "This package includes the GTK3-based gtk3, gtk3agg, and \
gtk3cairo backends for the python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-gtk3-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "236c3eb22ffdae5e18df1032af15d0a829c8a6c5365ed5c2f8fc646d25f1359bf6c8af00891ef8270d9c8b17e3966872dd52783f904c18d335cac10f757033de"

RPROVIDES:${PN} += "python39-matplotlib-gtk3 python39-matplotlib-gtk3(aarch-64)"
RDEPENDS:${PN} += "python(abi) python39-matplotlib python39-matplotlib-gtk-common"

inherit rpm
