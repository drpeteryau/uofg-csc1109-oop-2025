# Assessments

## Test 02 (AY23/24): `StudentManager`

Package `com.example.assessments.test02`.

| Class | Role |
|---|---|
| `StudentRecord`, `StudentRecordGenerator` | Provided classes. Sources were reconstructed from the compiled classes in the original test. |
| `StudentManager` | The starter with the four TODO tasks |
| `solution.StudentManagerSolution` | Reference solution |

Tasks: (a) show each student's name and subject scores, (b) compute the average, (c) handle appropriate exceptions, (d) write `results.txt`.

The generator deliberately injects, at most once each, a score of `0` and a score of `NaN`. The solution treats `NaN` (or anything outside 0-100) as invalid and prints `average=N/A`; `0` is a legitimate score.

Remove the `solution` package from the student-facing copy before releasing the starter.
