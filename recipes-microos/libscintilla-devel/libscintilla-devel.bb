SUMMARY = "Development files for Scintilla, a code editing component"
DESCRIPTION = "Scintilla is a code editing component. It includes features for \
editing and debugging source code, such as syntax styling, error \
indicators, code completion and call tips. \
 \
This subpackage contains the header files for developing \
applications that want to make use of the Scintilla library."
LICENSE = "MIT"

PV = "5.3.4"

RPM_NAME = "libscintilla-devel-5.3.4-1.1.aarch64.rpm"
RPM_HASH = "e9809b3e987375c9cdf85082e09f7550f58fac755639bdfeed7323f6acb6513c06e60e39f6121c299749b02f6eb178be0473c9e3c7b3622a56abdef3884194fb"

RPROVIDES:${PN} += "libscintilla-devel libscintilla-devel(aarch-64)"
RDEPENDS:${PN} += "libscintilla5 pkgconfig pkgconfig(glib-2.0) pkgconfig(gtk+-3.0)"

inherit rpm
