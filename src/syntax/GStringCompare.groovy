package syntax

/**
 * Usage: <b> GString and java.lang.String are different </b>
 *
 * @author lucifer
 * Date 2018-1-24
 * Device Aurora R5
 */
// GString and String don't have same hashcode
// Mind when using Map Keys
assert "hashcode compare: ${1}".hashCode() != "hashcode compare 1".hashCode()

def slash = /only forward slash \/ need to be sscaped by back slash \ /
println slash
// Slash string is multiline
def multi = /one
    two/
assert multi.contains('\n')

// Slash string supports interpolation
def slashIn = /count num ${233}/
println slashIn

// Slash string cannot be empty, will be comment
// assert '' == //

