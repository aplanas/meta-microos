SUMMARY = "A Mouse role for setting attributes from a simple configfile"
DESCRIPTION = "This role loads simple configfiles to set object attributes. It is based on \
the abstract role MouseX::ConfigFromFile, and uses Config::Any to load your \
configfile. Config::Any will in turn support any of a variety of different \
config formats, detected by the file extension. See Config::Any for more \
details about supported formats. \
 \
Like all MouseX::ConfigFromFile -derived configfile loaders, this module is \
automatically supported by the MouseX::Getopt role as well, which allows \
specifying '-configfile' on the commandline."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-MouseX-SimpleConfig-0.11-3.23.noarch.rpm"
RPM_HASH = "8472143bd35d8cc3cdc31eecf788a45479c1d3f5a594a2b08efacdab47e424461e3a1814fdc01571fdb1fd4c09fa671b9d5b2fb0f04b5f601e292ee66ca8e1d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MouseX::SimpleConfig) perl-MouseX-SimpleConfig"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Config::Any) perl(Mouse) perl(Mouse::Role) perl(MouseX::ConfigFromFile)"

inherit rpm
