/*
 * Account API
 *
 * With the Account service you can manage your API keys and track their usage. It is important to note that unlike all other APIs, the Account API needs a master API key for authentication. For more details consult the [concept](./concepts/api-key-management-and-usage).
 *
 * The version of the OpenAPI document: 1.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = PTV.Developer.Clients.account.Client.OpenAPIDateConverter;

namespace PTV.Developer.Clients.account.Model
{
    /// <summary>
    /// BillingPeriod
    /// </summary>
    [DataContract(Name = "BillingPeriod")]
    public partial class BillingPeriod : IEquatable<BillingPeriod>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BillingPeriod" /> class.
        /// </summary>
        /// <param name="startDate">The start date of the billing period formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339)..</param>
        /// <param name="endDate">The end date of the billing period formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339)..</param>
        public BillingPeriod(DateTimeOffset startDate = default(DateTimeOffset), DateTimeOffset endDate = default(DateTimeOffset))
        {
            this.StartDate = startDate;
            this.EndDate = endDate;
        }

        /// <summary>
        /// The start date of the billing period formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
        /// </summary>
        /// <value>The start date of the billing period formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).</value>
        /// <example>Thu Mar 21 00:00:00 UTC 2024</example>
        [DataMember(Name = "startDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTimeOffset StartDate { get; set; }

        /// <summary>
        /// The end date of the billing period formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
        /// </summary>
        /// <value>The end date of the billing period formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).</value>
        /// <example>Sat Apr 20 00:00:00 UTC 2024</example>
        [DataMember(Name = "endDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTimeOffset EndDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BillingPeriod {\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as BillingPeriod);
        }

        /// <summary>
        /// Returns true if BillingPeriod instances are equal
        /// </summary>
        /// <param name="input">Instance of BillingPeriod to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BillingPeriod input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.StartDate == input.StartDate ||
                    (this.StartDate != null &&
                    this.StartDate.Equals(input.StartDate))
                ) && 
                (
                    this.EndDate == input.EndDate ||
                    (this.EndDate != null &&
                    this.EndDate.Equals(input.EndDate))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.StartDate != null)
                {
                    hashCode = (hashCode * 59) + this.StartDate.GetHashCode();
                }
                if (this.EndDate != null)
                {
                    hashCode = (hashCode * 59) + this.EndDate.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
