SUMMARY = "Locate directory of original perl script"
DESCRIPTION = "Locates the full path to the script bin directory to allow the use of paths \
relative to the bin directory. \
 \
This allows a user to setup a directory tree for some software with \
directories <root>/bin and <root>/lib and then the above example will allow \
the use of modules in the lib directory without knowing where the software \
tree is installed. \
 \
If perl is invoked using the *-e* option or the perl script is read from \
'STDIN' then FindBin sets both 'Bin()' and 'RealBin()' return values to the \
current directory."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.05"

RPM_NAME = "perl-FindBin-Real-1.05-14.26.noarch.rpm"
RPM_HASH = "cef72eed95a0ed4b193fa4d041ed65baa9e144fc88f0246def22a81f476072aa7f8f875d34088501ac6a822c9ff0d8b3c0126f65f47feb0d633aa42e141124d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(FindBin::Real) \
perl-FindBin-Real"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
