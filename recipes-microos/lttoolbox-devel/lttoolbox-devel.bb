SUMMARY = "Development files for the Lexical Toolbox"
DESCRIPTION = "lttoolbox is a toolbox for lexical processing, morphological analysis \
and generation of words. Analysis is the process of splitting a word \
(e.g. cats) into its lemma 'cat' and the grammatical information \
<neutrum,plural>. Generation is the opposite process. \
 \
This subpackage contains the development files for lttoolbox."
LICENSE = "GPL-2.0-or-later"

PV = "3.7.1"

RPM_NAME = "lttoolbox-devel-3.7.1-1.5.aarch64.rpm"
RPM_HASH = "bb07646ea9b5a8a93258c0ed5788acfd8fd6823b2b636bb7bb3f45b3378f8d43a3c04ce2eaaf301392d6e02a8a0179bfc7c700ae4719f23d730e81271b1ced1a"

RPROVIDES:${PN} += "lttoolbox-devel lttoolbox-devel(aarch-64) pkgconfig(lttoolbox)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liblttoolbox3"

inherit rpm
