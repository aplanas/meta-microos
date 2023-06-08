SUMMARY = "Development files for the Lexical Toolbox"
DESCRIPTION = "lttoolbox is a toolbox for lexical processing, morphological analysis \
and generation of words. Analysis is the process of splitting a word \
(e.g. cats) into its lemma 'cat' and the grammatical information \
<neutrum,plural>. Generation is the opposite process. \
 \
This subpackage contains the development files for lttoolbox."
LICENSE = "GPL-2.0-or-later"

PV = "3.7.1"

RPM_NAME = "lttoolbox-devel-3.7.1-1.4.aarch64.rpm"
RPM_HASH = "66d1b83197668b4e54411a9643aeefac57771957d6fd6e4227b1efba61269bacf99234509ad607237d1c9208428a5da720470e27e861a67dbb47265dcaf05804"

RPROVIDES:${PN} += "lttoolbox-devel lttoolbox-devel(aarch-64) pkgconfig(lttoolbox)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liblttoolbox3"

inherit rpm
