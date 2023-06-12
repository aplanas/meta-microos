SUMMARY = "Python API / wrapper for tmux"
DESCRIPTION = "libtmux is a typed python scripting library for tmux. You can use it to command and control tmux servers, sessions, windows, and panes. It is the tool powering tmuxp, a tmux workspace manager."
LICENSE = "MIT"

PV = "0.22.1"

RPM_NAME = "python39-libtmux-0.22.1-1.1.noarch.rpm"
RPM_HASH = "e85b7cbfa5b6d2d0d8ee373ba0df05ccd0fbb34b460bea5460f40f4bec2d7eb62e4815f64076dec06b42ea9eb75a35531c42cd77f2c95e22a5a02b9257162da1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(libtmux) python39-libtmux python3dist(libtmux)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
