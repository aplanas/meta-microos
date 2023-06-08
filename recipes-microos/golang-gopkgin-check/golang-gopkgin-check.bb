SUMMARY = "Rich testing framework for the Go language"
DESCRIPTION = "The Go language provides an internal testing library, named 'testing', which is \
relatively slim due to the fact that the standard library correctness by itself \
is verified using it. The gocheck package, on the other hand, expects the \
standard library from Go to be working correctly, and builds on it to offer a \
richer testing framework for libraries and applications to use."
LICENSE = "BSD-3-Clause"

PV = "0.0.0+git20161122.aa8c435"

RPM_NAME = "golang-gopkgin-check-0.0.0+git20161122.aa8c435-1.16.aarch64.rpm"
RPM_HASH = "e1ba11c4644ce9b33c31d90565146c6c076b654523231e659b121fa48cbbf7b8fb47199c52f340ed5284f6dfaf948211eb46a65e313765a4f80ab8dd24a530f1"

RPROVIDES:${PN} += "golang-gopkgin-check golang-gopkgin-check(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
