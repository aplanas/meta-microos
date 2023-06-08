SUMMARY = "Shared data for the Core X11 protocol library"
DESCRIPTION = "The X Window System is a network-transparent window system that was \
designed at MIT. X display servers run on computers with either \
monochrome or color bitmap display hardware. The server distributes \
user input to and accepts output requests from various client \
programs located either on the same machine or elsewhere in the \
network. Xlib is a C subroutine library that application programs \
(clients) use to interface with the window system by means of a \
stream connection."
LICENSE = "MIT"

PV = "1.8.4"

RPM_NAME = "libX11-data-1.8.4-1.3.noarch.rpm"
RPM_HASH = "5b39e787a32742feed4ced58800ff5e07bfaba19887dc41b126111eda9ec3e60c99b41f2b7e1d5d3caff7f44e94c5334f7ec56821dd34c5b82540c127407bbe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libX11-data"
RDEPENDS:${PN} += ""

inherit rpm
