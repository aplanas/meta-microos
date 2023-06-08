SUMMARY = "The OCaml graphics library"
DESCRIPTION = "The graphics library provides a set of portable drawing \
primitives. Drawing takes place in a separate window that is created \
when Graphics.open_graph is called. \
 \
This library used to be distributed with OCaml up to OCaml 4.08."
LICENSE = "LGPL-2.1-only-WITH-OCaml-LGPL-linking-exception"

PV = "5.1.2"

RPM_NAME = "ocaml-graphics-5.1.2-2.8.aarch64.rpm"
RPM_HASH = "176c26c26a093bd828e2d01a2ffba551e2f7012e16e3b5966f354f66f787f43c359d7e0c733a31871d4ad9fbf1703a832232266e9b36aba44a207660420d64dd"

RPROVIDES:${PN} += "ocaml-graphics ocaml-graphics(aarch-64)"
RDEPENDS:${PN} += "libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
