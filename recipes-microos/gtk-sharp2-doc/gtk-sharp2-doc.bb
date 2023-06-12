SUMMARY = "Monodoc documentation for gtk-sharp2"
DESCRIPTION = "This package contains the gtk-sharp2 documentation for monodoc."
LICENSE = "LGPL-2.1-only"

PV = "2.12.45"

RPM_NAME = "gtk-sharp2-doc-2.12.45-3.8.aarch64.rpm"
RPM_HASH = "c565dd6e012c26a2eb13c388472b2aada6636cd567eed88bcdf13861cbf9b7ef46750721c884dc5ff72bed036a03f770965d9246ac41091edc90cb985618535c"

RPROVIDES:${PN} += "gtk-sharp2-doc \
gtk-sharp2-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
