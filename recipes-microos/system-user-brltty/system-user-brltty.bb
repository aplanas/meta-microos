SUMMARY = "System user and group named brltty"
DESCRIPTION = "System user for the Braille display driver for Linux/Unix"
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "system-user-brltty-6.5-2.3.noarch.rpm"
RPM_HASH = "ec36a6e2b5a6afde6b27e6333ff5e759201d8966d5a09c4180534b7c9710fe486b37e3db0220eedb9be76c4fb52a322aca689860de3a074f9916e5b749938fe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group(brlapi) group(brltty) system-user-brltty user(brltty)"
RDEPENDS:${PN} += "/bin/sh group(audio) group(dialout) group(input) group(pulse-access) group(root) group(tty) sysuser-shadow"

inherit rpm
