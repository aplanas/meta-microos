SUMMARY = "Convenience package providing os-autoinst + s390 worker jumphost deps"
DESCRIPTION = "Convenience package providing os-autoinst + s390 worker jumphost dependencies."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1683277334.0688448"

RPM_NAME = "os-autoinst-s390-deps-4.6.1683277334.0688448-1.1.aarch64.rpm"
RPM_HASH = "fcc124ea9e2566039e6333755b06740ce03893c98bf9b605bfbd8f2ff7222980a6636e68b11e9ceef0c3c363b1d6b3fd1ce48b44862babbb0c53611c538569a4"

RPROVIDES:${PN} += "os-autoinst-s390-deps os-autoinst-s390-deps(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/Xvnc /usr/bin/xkbcomp fonts-config icewm mkfontdir mkfontscale os-autoinst x3270 xdotool xterm xterm-console"

inherit rpm
