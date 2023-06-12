SUMMARY = "Convenience package providing os-autoinst + s390 worker jumphost deps"
DESCRIPTION = "Convenience package providing os-autoinst + s390 worker jumphost dependencies."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1683886197.05274f7"

RPM_NAME = "os-autoinst-s390-deps-4.6.1683886197.05274f7-1.1.aarch64.rpm"
RPM_HASH = "dd0e90aa9fc1d9a24a7ce892ae595932de857893f6d881a3eadb7ebda9ab80817c869e0018fe76a04117616c042c4bff24f3a246b504a6f98aec4b228e1b706b"

RPROVIDES:${PN} += "os-autoinst-s390-deps os-autoinst-s390-deps(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/Xvnc /usr/bin/xkbcomp fonts-config icewm mkfontdir mkfontscale os-autoinst x3270 xdotool xterm xterm-console"

inherit rpm
