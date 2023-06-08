SUMMARY = "Internal: Require all YaST Translation Packages (Empty)"
DESCRIPTION = "The package requires all YaST translation packages \
(yast2-trans-{??,??_??}).  Otherwise it is empty. \
 \
For internal use only."
LICENSE = "LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "yast2-trans-allpacks-4.3.0-1.9.noarch.rpm"
RPM_HASH = "deae288694a96d76cdbf3df0228028505d4a3bcb6aabd040ea75de71356e4306f9bc94179c1dc308741e03653ad17b02b68f0927ec3fd932705c5dc5717b5386"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-trans-allpacks"
RDEPENDS:${PN} += "yast2-trans-af yast2-trans-ar yast2-trans-ast yast2-trans-bg yast2-trans-bn yast2-trans-bs yast2-trans-ca yast2-trans-cs yast2-trans-cy yast2-trans-da yast2-trans-de yast2-trans-el yast2-trans-en_GB yast2-trans-es yast2-trans-et yast2-trans-fa yast2-trans-fi yast2-trans-fr yast2-trans-gl yast2-trans-gu yast2-trans-hi yast2-trans-hr yast2-trans-hu yast2-trans-id yast2-trans-it yast2-trans-ja yast2-trans-jv yast2-trans-ka yast2-trans-km yast2-trans-kn yast2-trans-ko yast2-trans-ku yast2-trans-lo yast2-trans-lt yast2-trans-mk yast2-trans-mr yast2-trans-nb yast2-trans-nds yast2-trans-nl yast2-trans-nn yast2-trans-pa yast2-trans-pl yast2-trans-pt yast2-trans-pt_BR yast2-trans-ro yast2-trans-ru yast2-trans-si yast2-trans-sk yast2-trans-sl yast2-trans-sr yast2-trans-sv yast2-trans-sw yast2-trans-ta yast2-trans-tg yast2-trans-th yast2-trans-tr yast2-trans-uk yast2-trans-vi yast2-trans-wa yast2-trans-xh yast2-trans-zh_CN yast2-trans-zh_TW yast2-trans-zu"

inherit rpm
