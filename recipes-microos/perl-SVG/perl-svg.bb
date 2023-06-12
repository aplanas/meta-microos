SUMMARY = "Perl extension for generating Scalable Vector Graphics (SVG) documents"
DESCRIPTION = "SVG is a 100% Perl module which generates a nested data structure \
containing the DOM representation of an SVG (Scalable Vector Graphics) \
image. Using SVG, you can generate SVG objects, embed other SVG instances \
into it, access the DOM object, create and access javascript, and generate \
SMIL animation content."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.87"

RPM_NAME = "perl-SVG-2.87-1.4.noarch.rpm"
RPM_HASH = "0bbf3a37c874ca95d83268caf81e9c52302d395e8a533d98f964817ec0c010d90b0fdaf8bc0af7de9bb82155b0acc3c6f7e0c057505222f1b3cd58f14934487e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(SVG) \
perl(SVG::DOM) \
perl(SVG::Element) \
perl(SVG::Extension) \
perl(SVG::XML) \
perl-SVG"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(parent)"

inherit rpm
