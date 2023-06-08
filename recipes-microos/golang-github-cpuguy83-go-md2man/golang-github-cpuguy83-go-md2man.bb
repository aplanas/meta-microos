SUMMARY = "Convert markdown into man pages"
DESCRIPTION = "Tool to converts markdown into man pages."
LICENSE = "MIT"

PV = "2.0.0+git20190314.f79a8a8"

RPM_NAME = "golang-github-cpuguy83-go-md2man-2.0.0+git20190314.f79a8a8-1.14.aarch64.rpm"
RPM_HASH = "b07e6610e2239b0b3e259c332ca0d7451b69c1464ad50f64c367870328790389d214f491d3fc4091be714a08785c82fb75bfd344003869dc897ade86353ea1e6"

RPROVIDES:${PN} += "golang-github-cpuguy83-go-md2man golang-github-cpuguy83-go-md2man(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
