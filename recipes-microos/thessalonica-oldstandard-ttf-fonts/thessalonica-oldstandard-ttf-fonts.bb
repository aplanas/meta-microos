SUMMARY = "Old Standard Font Family (TrueType Format)"
DESCRIPTION = "Old Standard was intended as a multilingual font family suitable for \
biblical, classical and medieval studies as well as for general-purpose \
typesetting in languages which use Greek or Cyrillic script. The font is \
currently available in three shapes: regular, italic and bold. Old \
Standard is still far from being finished, and yet it already covers \
a wide range of Latin, Greek and Cyrillic characters. It also supports \
early Cyrillic letters and signs (including those added in Unicode 5.1) \
and thus can be used for texts containing fragments in Old Slavonic and \
Church Slavonic languages. \
 \
This package contains fonts in TrueType format."
LICENSE = "OFL-1.1"

PV = "2.2"

RPM_NAME = "thessalonica-oldstandard-ttf-fonts-2.2-11.18.noarch.rpm"
RPM_HASH = "de0ff3c447842dd38809878db55d5c5d3c60f516043ab34be83800bfc1f96cbf206e482f3a29dc5e8f31c1b08e473a78dd88247f2dff347b6983d3fd826b5730"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oldstandard-fonts-ttf thessalonica-oldstandard-ttf-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
