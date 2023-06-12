SUMMARY = "Wrapper around terminal styling, screen positioning, and keyboard input"
DESCRIPTION = "Blessed is a thin, practical wrapper around terminal capabilities in Python. \
 \
Brief Overview \
-------------- \
 \
*Blessed* is a more simplified wrapper around curses, providing : \
 \
* Styles, color, and maybe a little positioning without necessarily \
  clearing the whole screen first. \
* Works great with standard Python string formatting. \
* Provides up-to-the-moment terminal height and width, so you can respond to \
  terminal size changes. \
* Avoids making a mess if the output gets piped to a non-terminal: \
  outputs to any file-like object such as *StringIO*, files, or pipes. \
* Uses the `terminfo(5)`_ database so it works with any terminal type \
  and supports any terminal capability: No more C-like calls to tigetstr_ \
  and tparm_. \
* Keeps a minimum of internal state, so you can feel free to mix and match with \
  calls to curses or whatever other terminal libraries you like. \
* Provides plenty of context managers to safely express terminal modes, \
  automatically restoring the terminal to a safe state on exit. \
* Act intelligently when somebody redirects your output to a file, omitting \
  all of the terminal sequences such as styling, colors, or positioning. \
* Dead-simple keyboard handling: safely decoding unicode input in your \
  system's preferred locale and supports application/arrow keys. \
* Allows the printable length of strings containing sequences to be \
  determined. \
 \
Blessed **does not** provide... \
 \
* Windows command prompt support.  A PDCurses_ build of python for windows \
  provides only partial support at this time -- there are plans to merge with \
  the ansi module in concert with colorama to resolve this."
LICENSE = "MIT"

PV = "1.19.1"

RPM_NAME = "python311-blessed-1.19.1-2.3.noarch.rpm"
RPM_HASH = "47a6498c5b9f94a38cadcc856fa39e81ee398ec4678da9d98a7ac413112336e789523ebe4bbed0bd30f47f14efd46a87a401b39809e5300d1be8f2b21c317ec2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(blessed) \
python311-blessed \
python3dist(blessed)"
RDEPENDS:${PN} += "python(abi) \
python311-curses \
python311-six \
python311-wcwidth"

inherit rpm
