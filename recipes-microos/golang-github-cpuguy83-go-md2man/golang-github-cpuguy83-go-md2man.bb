SUMMARY = "Convert markdown into man pages"
DESCRIPTION = "Tool to converts markdown into man pages."
LICENSE = "MIT"

PV = "2.0.0+git20190314.f79a8a8"

RPM_NAME = "golang-github-cpuguy83-go-md2man-2.0.0+git20190314.f79a8a8-1.15.aarch64.rpm"
RPM_HASH = "54af1836dc181a4561348ff7d951bf488384a7778836dc91e2e01ba36ccd3d480b1e7069cff3b14b6ab1ed9d873764b3116cc8a31931c5105c874f60e39abaa6"

RPROVIDES:${PN} += "golang-github-cpuguy83-go-md2man \
golang-github-cpuguy83-go-md2man(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
