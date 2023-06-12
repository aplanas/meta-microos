SUMMARY = "Cycle through a list of values via a scalar"
DESCRIPTION = "You use 'Tie::Cycle' to go through a list over and over again. Once you get \
to the end of the list, you go back to the beginning. You don't have to \
worry about any of this since the magic of tie does that for you. \
 \
The tie takes an array reference as its third argument. The tie should \
succeed unless the argument is not an array reference. Previous versions \
required you to use an array that had more than one element (what's the \
pointing of looping otherwise?), but I've removed that restriction since \
the number of elements you want to use may change depending on the \
situation. \
 \
During the tie, this module makes a shallow copy of the array reference. If \
the array reference contains references, and those references are changed \
after the tie, the elements of the cycle will change as well. See the \
included _test.pl_ script for an example of this effect."
LICENSE = "Artistic-2.0"

PV = "1.227"

RPM_NAME = "perl-Tie-Cycle-1.227-1.7.noarch.rpm"
RPM_HASH = "f7621faf8be482c5b6959790fa24646f6f34ccf40a920579e62134cd343379f1403444240e7d9406b3f8efd4e1d48bcb90e71fa3bd57d1a3e066001ff702f8ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Tie::Cycle) \
perl-Tie-Cycle"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
