SUMMARY = "Korn Shell development environment"
DESCRIPTION = "The package includes C header files and the static libraries together \
with the shared libraries for linking with other projects.  Please be \
aware that the CPL licensed code can not be used within GPL licensed \
project. \
 \
 \
 \
Authors: \
-------- \
    David Korn <dgk@research.att.com> \
    Glenn Fowler <gsf@research.att.com> \
    Phong Vo <kpv@research.att.com>"
LICENSE = "CPL-1.0"

PV = "93vu"

RPM_NAME = "ksh-devel-93vu-6.2.aarch64.rpm"
RPM_HASH = "0a786456f1a6ff62f2986fc12c17487c23385b757ec79e315ed12efc1efab15c22f1bff0618902c6b156280ac15e3b58c4d5985b1ab3c2f9597cdd9da4ed4fe4"

RPROVIDES:${PN} += "ksh-devel ksh-devel(aarch-64)"
RDEPENDS:${PN} += "ksh"

inherit rpm
