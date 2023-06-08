SUMMARY = "SVG thumbnailer using the GNOME Render SVG library"
DESCRIPTION = "This package contains a thumbnailer to render SVG (scalable vector \
graphics) data."
LICENSE = "LGPL-2.0-or-later"

PV = "2.56.0"

RPM_NAME = "rsvg-thumbnailer-2.56.0-3.1.noarch.rpm"
RPM_HASH = "e7ff1464c2f1e3c54e7ae454b4427c0636cc187d53e94735bcb426ecab1621c87e3ac6a08b0e45e4f702f22afc8a6cc57d565c8066b0cc8fbca6659d8631d749"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rsvg-thumbnailer"
RDEPENDS:${PN} += ""

inherit rpm
