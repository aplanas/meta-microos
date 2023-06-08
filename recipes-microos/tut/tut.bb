SUMMARY = "A TUI for Mastodon with vim inspired keys"
DESCRIPTION = "tut is a TUI for Mastodon with vim inspired keys. TUI is an acronym for text-based user interface, so tut runs in your terminal."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "tut-2.0.1-1.1.aarch64.rpm"
RPM_HASH = "3476134b7ac722532ad24cd935c1c83a2e1aac24b98563d2f188535190732c5ddd818de29ea945c15dfc3e1232db9d1ae5f12056c1df9a2c76899e14f482a623"

RPROVIDES:${PN} += "tut tut(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
