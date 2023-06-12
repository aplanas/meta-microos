SUMMARY = "Builds trie-ized regexp"
DESCRIPTION = "This module is a faster but simpler version of Regexp::Assemble or \
Regexp::Optimizer. It builds a trie-ized regexp as above. \
 \
This module is faster than Regexp::Assemble but you can only add literals. \
'a+b' is treated as 'a\\+b', not 'more than one a's followed by b'. \
 \
I wrote this module because I needed something faster than Regexp::Assemble \
and Regexp::Optimizer. If you need more minute control, use those instead."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.02"

RPM_NAME = "perl-Regexp-Trie-0.02-1.9.noarch.rpm"
RPM_HASH = "7db4a04b3c83f19a6c2ba4bfcf818bce659acc2724f5fb5b4fbedec1af4bbb6b3006e93d54190736532f9864f75ad7ec0036d261c3fac30d1a2225a7d312e155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Regexp::Trie) \
perl-Regexp-Trie"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
