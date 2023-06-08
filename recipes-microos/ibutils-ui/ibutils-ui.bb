SUMMARY = "OpenIB Mellanox InfiniBand Diagnostic Tools"
DESCRIPTION = " \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
The ibutils-ui package provides a set of graphical UI tools that check the health \
of an InfiniBand fabric. \
 \
Package components: \
ibdiag:   This package provides one tool which provide the user interface \
          to activate the above functionality: \
            - ibdiagui:   A GUI wrapper for ibdiagnet and ibdiagpath."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.5.7.0.2"

RPM_NAME = "ibutils-ui-1.5.7.0.2-11.7.aarch64.rpm"
RPM_HASH = "95f5aef03ef325f704ca3a1e5d13a43a84833b9b97d5865b62acceef25f6cf281133d9b36a4ffdfa0dc7280e0a7a3acf014ec041618a29f4d5a9da2957ae8c09"

RPROVIDES:${PN} += "ibutils-ui ibutils-ui(aarch-64)"
RDEPENDS:${PN} += "/bin/sh graphviz-tcl ibutils"

inherit rpm
