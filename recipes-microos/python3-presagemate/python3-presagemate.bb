SUMMARY = "Universial predictive text companion"
DESCRIPTION = "Pypresagemate is a universal predictive text companion. Pypresagemate works alongside any AT-SPI aware application. The Assistive Technology Service Provider Interface (AT-SPI) is a toolkit-neutral way of providing accessibility facilities in applications. Pypresagemate works in the background by tracking what keystrokes are typed and displaying predictions in its window. When a prediction is selected, text is sent to the active application."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "python3-presagemate-0.9.1-12.10.noarch.rpm"
RPM_HASH = "92a2ad21f7d718274883a54bf5bd62f84fda9b163fc495bc4b7cd5fbeb842cedb4957803b3c90939e94eafcac2a045faae73acef977905336e04512c92f66bb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-presagemate python3-presagemate"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-atspi python3-gobject python3-presage python3-xlib typelib(Gdk) typelib(Gtk) typelib(Pango)"

inherit rpm
