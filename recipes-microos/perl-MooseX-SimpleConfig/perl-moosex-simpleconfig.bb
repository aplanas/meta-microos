SUMMARY = "A Moose role for setting attributes from a simple configuration file"
DESCRIPTION = "This role loads simple files to set object attributes. It is based on the \
abstract role the MooseX::ConfigFromFile manpage, and uses the Config::Any \
manpage to load your configuration file. the Config::Any manpage will in \
turn support any of a variety of different config formats, detected by the \
file extension. See the Config::Any manpage for more details about \
supported formats. \
 \
To pass additional arguments to the Config::Any manpage you must provide a \
'config_any_args()' method, for example: \
 \
  sub config_any_args { \
    return { \
      driver_args => { General => { '-InterPolateVars' => 1 } } \
    }; \
  } \
 \
Like all the MooseX::ConfigFromFile manpage -derived file loaders, this \
module is automatically supported by the the MooseX::Getopt manpage role as \
well, which allows specifying '-configfile' on the command line."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-MooseX-SimpleConfig-0.11-1.24.noarch.rpm"
RPM_HASH = "6193294333e4d60b8a8eb34e7c9a5087d9d1bb5fabe28d8a55f65212e0a78475bf2ccb4f182d6f7c2c3c0581eb0a2abf86715f26becac0e55e611fe0d4647614"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::SimpleConfig) \
perl-MooseX-SimpleConfig"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Config::Any) \
perl(Moose::Role) \
perl(MooseX::ConfigFromFile)"

inherit rpm
