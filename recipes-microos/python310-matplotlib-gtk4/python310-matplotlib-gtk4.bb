SUMMARY = "GTK4 backends for python310-matplotlib"
DESCRIPTION = "This package includes the GTK4-based gtk4, gtk4agg, and \
gtk4cairo backends for the python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-gtk4-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "4931e72f12728c1af917c7cd247116fbc053839259e4f634ff74c889b87ed6c714bcbadf56d35b91dd38d9002ee0b07df5f0c7c91e183b1d4f00a930219c6633"

RPROVIDES:${PN} += "python3-matplotlib-gtk4 python310-matplotlib-gtk4 python310-matplotlib-gtk4(aarch-64)"
RDEPENDS:${PN} += "python(abi) python310-matplotlib python310-matplotlib-gtk-common"

inherit rpm
