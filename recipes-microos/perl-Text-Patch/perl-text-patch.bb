SUMMARY = "Patches text with given patch"
DESCRIPTION = "Text::Patch combines source text with given diff (difference) data. Diff \
data is produced by Text::Diff module or by the standard diff utility (man \
diff, see -u option). \
 \
* patch( $source, $diff, options... ) \
 \
  First argument is source (original) text. Second is the diff data. Third \
  argument can be either hash reference with options or all the rest \
  arguments will be considered patch options: \
 \
      $output = patch( $source, $diff, STYLE => 'Unified', ... ); \
 \
      $output = patch( $source, $diff, { STYLE => 'Unified', ... } ); \
 \
  Options are: \
 \
    STYLE => 'Unified' \
 \
  STYLE can be 'Unified', 'Context' or 'OldStyle'. \
 \
  The 'Unified' diff format looks like this: \
 \
    @@ -1,7 +1,6 @@ \
    -The Way that can be told of is not the eternal Way; \
    -The name that can be named is not the eternal name. \
     The Nameless is the origin of Heaven and Earth; \
    -The Named is the mother of all things. \
    +The named is the mother of all things. \
    + \
     Therefore let there always be non-being, \
       so we may see their subtlety, \
     And let there always be being, \
    @@ -9,3 +8,6 @@ \
     The two are the same, \
     But after they are produced, \
       they have different names. \
    +They both may be called deep and profound. \
    +Deeper and more profound, \
    +The door of all subtleties!"
LICENSE = "GPL-2.0+"

PV = "1.8"

RPM_NAME = "perl-Text-Patch-1.8-7.26.noarch.rpm"
RPM_HASH = "e5ed75f76cfa2ae18ac95720e5102d7a4bf35b8a6492ee2f75cd9a89d49727715c7958154da2bc93152689eef45573f2915b54b14d923d44c02ad4a80da2df6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Text::Patch) \
perl-Text-Patch"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Text::Diff)"

inherit rpm
