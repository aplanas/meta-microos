SUMMARY = "DocBook based Schema for older SUSE Documentation"
DESCRIPTION = "NovDoc is a DTD/RELAX NG schema used for older SUSE documentation."
LICENSE = "GPL-3.0-only"

PV = "1.0_2.2.2"

RPM_NAME = "novdoc-1.0_2.2.2-11.1.noarch.rpm"
RPM_HASH = "553b7ae758db17351cd5bfa74bdde0daabe36ade48a15b172f26c61b8a7db402a31a4a37fe5528946dcd2b482b5a92c7a99b8a1fcfc8334d4abd817edea0ee16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(novdoc) novdoc"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
